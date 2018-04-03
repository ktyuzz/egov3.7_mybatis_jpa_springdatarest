<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>eGovFrame 공통 컴포넌트</title>
</head>
<body>
	<c:if test="${loginVO != null}">
		${loginVO.name }님 환영합니다. <a href="${pageContext.request.contextPath }/uat/uia/actionLogout.do">로그아웃</a>
	</c:if>
	<c:if test="${loginVO == null }">
		<jsp:forward page="/uat/uia/egovLoginUsr.do"/>
	</c:if>
	<p/><p/><p/>
	<a href="/com/sysmgnt/category/egovCategoryList.do" >JPA 테스트는 여길 참고하세요 ---▶ 클릭클릭 ----▶ /com/sysmgnt/category/egovCategoryList.do </a></br>
		
	<a href="/api/sysmgnt/categories" >/api/sysmgnt/categories </a></br>
	
	<a href="/api/sysmgnt/category/CATEGORY-00000000000" >/api/sysmgnt/category/CATEGORY-00000000000 </a></br>
	
	<a href="/api/sysmgnt/category/CATEGORY-00000000001" >/api/sysmgnt/category/CATEGORY-00000000001 </a></br>
	
	<a href="/api/sysmgnt/category/CATEGORY-00000000002" >/api/sysmgnt/category/CATEGORY-00000000002 </a></br>
	
	<a href="/api/sysmgnt/category/CATEGORY-00000000003" >/api/sysmgnt/category/CATEGORY-00000000003 </a></br>
		
	<p/><p/><p/>
<!-- 	<b>실행시 오류사항이 있으시면 표준프레임워크센터로 연락하시기 바랍니다.<br /><br/>
	<b>* 화면 설명 *</b><p/>
	왼쪽 메뉴는 메뉴과 관련된 컴포넌트(메뉴관리, 사이트맵 등)들의 영향을 받지 않습니다.<p/>
	각 컴포넌트들을 쉽게 찾아볼 수 있는 바로가기 링크페이지 입니다.<p/>

	<br /><b>* egovframework.com.cmm.web.EgovComIndexController.java 설명 *</b><p/>

	컴포넌트 설치 후 설치된 컴포넌트들을 IncludedInfo annotation을 통해 찾아낸 후<p/>
	화면에 표시할 정보를 처리하는 Controller 클래스<p/><br />
	개발시 메뉴 구조가 잡히기 전에 배포파일들에 포함된 공통 컴포넌트들의 목록성 화면에<p/>
	URL을 제공하여 개발자가 편하게 활용하도록 하기 위해 작성된 것임<p/>
	<b>실 운영 시에는 삭제해서 배포하는 것을 권장함</b><p />

	운영시에 본 컨트롤을 사용하여 메뉴를 구성하는 경우 성능 문제를 일으키거나<p/>
	사용자별 메뉴 구성에 오류를 발생할 수 있음<p /> -->
</body>
</html>