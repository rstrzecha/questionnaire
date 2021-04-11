<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../dynamic/head.jspf"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>${survey.description}</b></div>
                <div class="py-2 h6">Wyniki</div>
            </div>
        </div>
    </div>

        <c:forEach items="${questions}" var="question" varStatus="status">
            <div class="container mt-sm-5 my-1">
                <div class="question ml-sm-5 pl-sm-5 pt-2">
                    <div class="py-2 h5"><b>${question.text}</b></div>
                    <div class="column ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3">
                        <div class="py-2">${question.optionA}</div>
                        <div class="py-2">Odpowiedziano ${question.countOptionA} raz(y)</div>

                        <div class="py-2">${question.optionB}</div>
                        <div class="py-2">Odpowiedziano ${question.countOptionB} raz(y)</div>

                        <div class="py-2">${question.optionC}</div>
                        <div class="py-2">Odpowiedziano ${question.countOptionC} raz(y)</div>

                        <div class="py-2">${question.optionD}</div>
                        <div class="py-2">Odpowiedziano ${question.countOptionD} raz(y)</div>
                    </div>

                </div>
            </div>
        </c:forEach>

<%@include file="../dynamic/js.jspf"%>
