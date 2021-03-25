<%@include file="../dynamic/head.jspf"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Witamy w Ankieterze</b></div>
                <div class="py-2 h6">Wybierz ankietę z poniższej listy</div>
            </div>
        </div>
    </div>


    <div class="container mt-sm-5 my-1">
        <a href='<c:url value="/dosurvey"/>'>
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h5" style="color: #ddd"><b>Ankieta nr 1</b></div>
            </div>
        </a>
    </div>

    <div class="container mt-sm-5 my-1">
        <a href='<c:url value="/dosurvey"/>'>
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h5" style="color: #ddd"><b>Ankieta nr 2</b></div>
            </div>
        </a>
    </div>

    <div class="container mt-sm-5 my-1">
        <a href='<c:url value="/dosurvey"/>'>
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h5" style="color: #ddd"><b>Ankieta nr 3</b></div>
            </div>
        </a>
    </div>


<%@include file="../dynamic/js.jspf"%>

