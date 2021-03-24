<%@include file="dynamic/head.jspf"%>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Serwis do quizów/ankiet</b></div>
                <div class="py-2 h6">Wybierz czy chcesz zrobić quiz, czy uzupełnić ankietę</div>
            </div>
        </div>
    </div>

    <a href='<c:url value="/surveys"/>'>
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h5"><b>Ankieta</b></div>
            </div>
        </div>
    </a>

    <div class="container mt-sm-5 my-1">
        <div class="question ml-sm-5 pl-sm-5 pt-2">
            <div class="py-2 h5"><b>Quiz</b></div>
        </div>
    </div>

<%@include file="dynamic/js.jspf"%>

