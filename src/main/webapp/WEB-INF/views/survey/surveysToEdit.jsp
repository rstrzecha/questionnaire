<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/head.jspf"%>
<jsp:useBean id="now" class="java.util.Date"/>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Wybierz Ankietę do edycji</b></div>
<%--                <div class="py-2 h6">Wybierz ankietę z poniższej listy</div>--%>
            </div>
        </div>
    </div>

    <c:forEach items="${survey}" var="query">
        <form action="/deleteSurvey/${query.id}" method="post">
            <div class="qcontainer mt-sm-5 mx-auto">
                <a href='<c:url value="/editSurvey/${query.id}"/>'>
                    <div class="question ml-sm-5 pl-sm-5 pt-2">
                        <div class="py-2 h5" style="color: #ddd"><b>${query.description}</b></div>
                    </div>
                </a>
                <button  type="submit">Usuń ankietę</button>
            </div>
        </form>
    </c:forEach>


    <form name="postSaveSurvey" method="post" action="/saveSurvey" modelAttribute="survey">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Tutaj możesz dodać nową ankietę</b></div>

                <div>
                    <label for="Description">Krótki opis ankiety: </label>
                    <input name="description" id="Description"/>
                </div>

                <div>
                    <label for="Name">Autor: </label>
                    <input name="name" id="Name"/>
                </div>

                <input type="hidden" value="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${now}" />" name="date">

                <div class=""> <button class="btn btn-success">Dodaj ankietę</button> </div>
            </div>
        </div>
    </form>


<%@include file="../dynamic/js.jspf"%>

