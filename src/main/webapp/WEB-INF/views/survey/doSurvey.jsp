<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="../dynamic/head.jspf"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>${survey.description}</b></div>
                <div class="py-2 h6">Zapraszamy do wypełnienia</div>
            </div>
        </div>
    </div>

    <form:form name="postSaveAnswers" method="post" action="/save" modelAttribute="answerForm">

        <c:forEach items="${questions}" var="question" varStatus="status">
            <div class="container mt-sm-5 my-1">
                <div class="question ml-sm-5 pl-sm-5 pt-2">
                    <div class="py-2 h5"><b>${question.text}</b></div>

                    <input type="hidden" name="answers[${status.index}].questionId" value="${question.id}"/>

                    <div class="column ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3">
                        <label class="options">${question.optionA} <input type="radio"
                                                                          name="answers[${status.index}].selection"
                                                                          value="A"> <span class="checkmark"></span> </label>
                        <label class="options">${question.optionB} <input type="radio"
                                                                          name="answers[${status.index}].selection"
                                                                          value="B"> <span class="checkmark"></span> </label>
                        <label class="options">${question.optionC} <input type="radio"
                                                                          name="answers[${status.index}].selection"
                                                                          value="C"> <span class="checkmark"></span> </label>
                        <label class="options">${question.optionD} <input type="radio"
                                                                          name="answers[${status.index}].selection"
                                                                          value="D"> <span class="checkmark"></span> </label>
                    </div>

                </div>
            </div>
        </c:forEach>


        <div class="container mt-sm-5 my-1">
            <div class="d-flex align-items-center pt-3">
                <!-- <div id="prev"> <button class="btn btn-primary">Previous</button> </div> -->
                <div class=""> <button class="btn btn-success">Zatwierdź</button> </div>
            </div>
        </div>

    </form:form>


<%@include file="../dynamic/js.jspf"%>
