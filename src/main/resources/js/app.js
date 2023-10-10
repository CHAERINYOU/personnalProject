// 프로젝트 시에는 분리해서 사용하는 것도 중요--> 초기화 작업 등 반복되는 것은 initialize해서 바꾸는 것도 중요
import {user_main} from './template-user-main.js';
import {user_login_form} from './template-user-login-form.js';
import {user_write_form} from './template-user-write-form.js';
import {user_view} from './template-user-view.js';
import {createInitializer} from "./initializer.js";
import {ajaxRequest} from "./request.js";
import {USER_DELETE_ACTION,USER_LOGIN_ACTION,
		USER_LOGOUT_ACTION,USER_MODIFY_ACTION,
		USER_VIEW,USER_WRITE_ACTION} from "./request-url.js";
		
import * as ResponseStatusCode from "./response_status_code.js";
import { user_modify_form } from './template-modify-form.js';

const initialize = createInitializer();
initialize.addCustomFunctionHandlebars();
initialize.registerAjaxGlobalEvent();

function navigate() {
	/********* path *********
		#/user_login_form
		#/user_write_form
		#/user_logout_action
		#/user_view
		#/user_main
		#/user_write_action
		#/user_login_action
		#/user_modify_form
		#/user_delete_action
	**************************/
	let path = window.location.hash.substring(1);
	console.log("hashchange --> " + path);
	if (!path) path = "/user_main";

	let html = '';
	if (path == '/user_main') {
		/**************** /user_main******************/
		html = user_main();
		$('#content').html(html);
	} else if (path == '/user_write_form') {
		/**************** /user_write_form ************/
		html = user_write_form();
		$('#content').html(html);
		/*###############################[form validator plugin]##########################
		form validator
		 - HOMEPAGE :   https://jqueryvalidation.org/
		 - API      :   https://jqueryvalidation.org/validate/
			1. $(form).validate() function은 form loading시에 미리 호출되어있어야한다.
			2. var validator=$(form).validate(); 실행후 반환되는 validator 객체를 사용한다.
		#################################################################################*/

		initialize.validatorUserWriteFormSetDefault();
		let validator = $('#user_write_form').validate();
		initialize.setValidator(validator);

	} else if (path == '/user_write_action') {
		/**************** /user_write_action**********/
		if (initialize.getValidator().form()) {
			let sendJsonObject = {
				userId: document.f.userId.value,
				password: document.f.password.value,
				name: document.f.name.value,
				email: document.f.email.value
			}
			const responseJsonObject =
				ajaxRequest(USER_WRITE_ACTION.method, USER_WRITE_ACTION.url, sendJsonObject);
			if (responseJsonObject.status == ResponseStatusCode.CREATED_USER) {
				/*
				 window 에 hashchange이벤트발생
				*/
				window.location.hash = '/user_login_form';
			} else if (responseJsonObject.status == ResponseStatusCode.CREATE_FAIL_EXISTED_USER) {
				html = user_write_form(responseJsonObject);
				$('#content').html(html);
				let validator = $('#user_write_form').validate();
				initialize.setValidator(validator);
			}
		}

	} else if (path == '/user_login_form') {
		/**************** /user_login_form************/
		html = user_login_form();
		$('#content').html(html);
		
	} else if (path == '/user_login_action') {
		/**************** /user_login_action**********/
		let sendJsonObject={
			userId:document.f.userId.value,
			password:document.f.password.value,
			name:'',
			email:''
			}
		const responseJsonObject = 
			ajaxRequest(USER_LOGIN_ACTION.method,
						USER_LOGIN_ACTION.url,
						sendJsonObject);	
		if(responseJsonObject.status == ResponseStatusCode.LOGIN_SUCCESS){
			// 로그인 후에는 메인의 내용이 바뀜 -> 따라서 페이지 리로딩 (href)
			// page reloading --> 돔트리 변경 및 타임리프가 로그인 체크 후 로그인/ 로그아웃 확인
			window.location.href='user';
			
		}else if(responseJsonObject.status == ResponseStatusCode.LOGIN_FAIL_NOT_FOUND_USER){
			html = user_login_form(responseJsonObject);
			$('#content').html(html);
			
		}else if(responseJsonObject.status == ResponseStatusCode.LOGIN_FAIL_PASSWORD_MISMATCH_USER){
			html = user_login_form(responseJsonObject);
			$('#content').html(html);
		}
		
	} else if (path == '/user_logout_action') {
		/**************** /user_logout_action*********/
		const responseJsonObject = 
			  ajaxRequest(USER_LOGOUT_ACTION.method,
						  USER_LOGOUT_ACTION.url);
		if(responseJsonObject.status == ResponseStatusCode.LOGOUT_USER){
			window.location.href = 'user';
			// herf통해서 다리 user.html 리로딩
		}					
		
	}  else if (path.startsWith('/user_view/')) {
		/**************** /user_view/userId **********/
		const userId = path.substring(path.lastIndexOf("/")+1);
		const responseJsonObject = 
			  ajaxRequest(USER_VIEW.method,
			  			  USER_VIEW.url.replace('@userId',userId));
		if(responseJsonObject.status == ResponseStatusCode.READ_USER){
			html = user_view(responseJsonObject);
			$('#content').html(html);
		}
		
	} else if (path.startsWith('/user_modify_form/')) {
		/**************** /user_modify_form/userId **********/
		const userId = path.substring(path.lastIndexOf("/")+1);
		const responseJsonObject = 
			ajaxRequest(USER_VIEW.method,USER_VIEW.url.replace('@userId',userId));
		if(responseJsonObject.status== ResponseStatusCode.READ_USER){
			html = user_modify_form(responseJsonObject);
			$('#content').html(html);
		}
		
	} else if (path.startsWith('/user_modify_action/')) {
		/**************** /user_modify_action/userId ******************/
		const userId = path.startsWith(path.lastIndexOf("/")+1);
		let sendJsonObject={
			userId: userId,
			password: document.f.password.value,
			name: document.f.name.value,
			email: document.f.email.value
			}
		const responseJsonObject = 
			ajaxRequest(USER_MODIFY_ACTION.method,
						USER_MODIFY_ACTION.url.replace('@userId',userId),
						sendJsonObject);
		if(responseJsonObject.status == ResponseStatusCode.UPDATE_USER){
				window.location.hash = `/user_view/${userId}`; 			
		}	  
		
	} else if (path.startsWith('/user_delete_action/')) {
		/**************** /user_delete_action/userId ******************/
		const userId = path.startsWith(path.lastIndexOf("/")+1);
		const responseJsonObject =
			  ajaxRequest(USER_DELETE_ACTION.method,
			  			  USER_DELETE_ACTION.url.replace("@userId",userId),
			  			  sendJsonObject);
		if(responseJsonObject.status == ResponseStatusCode.DELETE_USER){
				window.location.hash = 'user'; 			
		}	
	} else {
		html = user_main(responseJsonObject);
		$('#content').html(html);
	}
}//navigate
navigate();

/********window hashchange event 등록 **********/
$(window).on('hashchange',navigate);
/********button[data-navigate] click event 등록 **********/
$(document).on('click','[data-navigate]',function(e){
	/*	window.location의 hash값을 변경하면 hashchange event발생*/
	console.log('click-->'+e.target.getAttribute('data-navigate'));
	
	/* window.location.hash = e.target.getAttribute('data-navigate'); */
	if(e.target.getAttribute('data-navigate')=='/user_write_action'||
	   e.target.getAttribute('data-navigate')=='/user_login_action'){
		/* 액션버튼을 클릭 시 해쉬값변경되어 다시 클릭하는 경우 이미 해쉬값이 변경된 상태라
		   해쉬값이 변경되지 않음.*/
		if (window.location.hash.substring(1) == e.target.getAttribute('data-navigate')) {
			navigate();
		    /* window.location.hash와 e.target.getAttribut('data-navigate') 
		       동일한 경우에는 두번째 요청임.
		        --> 현재 해쉬값과 버튼 data-navigate 속성값이 같은 경우(hashchange 이벤트 발생)
			        해쉬값을 변경되지 않아서 이벤트가 발생안됨
			        히스토리가 남는경우에는 작업이 안되는 경우 생김 */
		} else {
			window.location.hash = e.target.getAttribute('data-navigate');
			 /* window.location.hash와 e.target.getAttribut('data-navigate') 
			    다른 경우에는 첫번째 요청 
			    --> 현재 해쉬값과 버튼 data-navigate 속성값이 다른 경우(hashchange 이벤트 발생)
			        해쉬값을 변경하여 이벤트가 발생 */
			}
		}else {
		window.location.hash = e.target.getAttribute('data-navigate');
		}

});
