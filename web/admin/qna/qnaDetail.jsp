<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/admin/header.jsp"%>
<%@ include file="/admin/sub_menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<script type="text/javascript">
	function go_list(contextPath) {
		var theForm = document.frm;
		theForm.action = contextPath + "/admin/qnas/adminQnAList";
		theForm.submit();
	}

	function go_rep(contextPath, qseq) {
		var theForm = document.frm;
		theForm.qseq.value = qseq;
		theForm.action = contextPath + "/admin/qnas/adminQnARepSave";
		theForm.submit();
	}
</script>
<article>
	<h1>Q&amp;A 게시판</h1>
	<form name="frm" method="post">
		<input type="hidden" name="qseq">
		<table id="orderList">
			<tr>
				<th width="20%">제목</th>
				<td>${qnaVO.subject} ${qnaVO.rep}</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td><fmt:formatDate value="${qnaVO.indate}" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${qnaVO.content}</td>
			</tr>
		</table>
		<c:choose>
			<c:when test='${qnaVO.rep=="1"}'>
				<table id="orderList">
					<tr>
						<td colspan="2">
							<img src="${contextPath}/admin/images/opinionimg01.gif">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<textarea name="reply" rows="3" cols="50"></textarea>
							<input type="button" class="btn" value="저장" onClick="go_rep('${contextPath}', '${qnaVO.qseq}')">
						</td>
					</tr>
				</table>
				<br>
			</c:when>
			<c:otherwise>
				<table id="orderList">
					<tr>
						<th>댓글</th>
						<td>${qnaVO.reply}</td>
					</tr>
				</table>
			</c:otherwise>
		</c:choose>
		<input type="button" class="btn" value="목록" onClick="go_list('${contextPath}')">
	</form>
</article>
<%@ include file="/admin/footer.jsp"%>
</body>
</html>