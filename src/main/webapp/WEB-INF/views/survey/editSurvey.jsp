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


    <c:forEach items="${questions}" var="question" varStatus="status">
        <form action="/deleteQuestion/${question.id}/${survey.id}" method="post">
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
                <button  type="submit">Usuń pytanie</button>
            </div>
        </form>
    </c:forEach>


    <form name="postSaveQuestion" method="post" action="/saveQuestion/${survey.id}" modelAttribute="question">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Tutaj możesz dodać nowe pytanie</b></div>

                <div>
                    <div class="py-2 h6"><b>Podaj treść pytania: </b></div>
                    <input name="text" id="Text"/>
                </div>

                <div class="py-2 h6"><b>Podaj opcje odpowiedzi</b></div>
                <div>
                    <label for="OptionA">Opcja A: </label>
                    <input name="optionA" id="OptionA"/>
                </div>
                <div>
                    <label for="OptionB">Opcja B: </label>
                    <input name="optionB" id="OptionB"/>
                </div>
                <div>
                    <label for="OptionC">Opcja C: </label>
                    <input name="optionC" id="OptionC"/>
                </div>
                <div>
                    <label for="OptionD">Opcja D: </label>
                    <input name="optionD" id="OptionD"/>
                </div>


                <div class=""> <button class="btn btn-success">Dodaj pytanie</button> </div>
            </div>
        </div>
    </form>

<%@include file="../dynamic/js.jspf"%>
