<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/head.jspf"%>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Witamy w Ankieterze</b></div>
                <div class="py-2 h6">Wybierz ankietę z poniższej listy</div>
            </div>
        </div>
    </div>

    <c:forEach items="${survey}" var="query">
    <div class="qcontainer mt-sm-5 mx-auto">
        <a href='<c:url value="/dosurvey/${query.id}"/>'>
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h5" style="color: #ddd"><b>${query.description}</b></div>
            </div>
        </a>
    </div>
    </c:forEach>


    <form name="postSaveSurvey" method="post" action="/saveSurvey" modelAttribute="survey">

    <div class="container mt-sm-5 my-1">
        <div class="question ml-sm-5 pl-sm-5 pt-2">

            <label for="Description">Krótki opis ankiety</label>
            <input name="description" id="Description"/>


            <div class=""> <button class="btn btn-success">Dodaj ankietę</button> </div>


        </div>
    </div>





    </form>




<%@include file="../dynamic/js.jspf"%>

