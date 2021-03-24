<%@include file="../dynamic/head.jspf"%>

<body>
    
    <div class="formViewerTitle">
        <div class="container mt-sm-5 my-1">
            <div class="question ml-sm-5 pl-sm-5 pt-2">
                <div class="py-2 h4"><b>Jakaś nowa ankieta</b></div>
                <div class="py-2 h6">Zapraszamy do wypełnienia</div>
            </div>
        </div>
    </div>
    

    <div class="container mt-sm-5 my-1">
        <div class="question ml-sm-5 pl-sm-5 pt-2">
            <div class="py-2 h5"><b>Q. which option best describes your job role?</b></div>
            <div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
                <label class="options">Small Business Owner or Employee <input type="radio" name="question1"> <span class="checkmark"></span> </label>
                <label class="options">Nonprofit Owner or Employee <input type="radio" name="question1"> <span class="checkmark"></span> </label>
                <label class="options">Journalist or Activist <input type="radio" name="question1"> <span class="checkmark"></span> </label>
                <label class="options">Other <input type="radio" name="question1"> <span class="checkmark"></span> </label>
            </div>
        </div>
    </div>

    <div class="container mt-sm-5 my-1">
        <div class="question ml-sm-5 pl-sm-5 pt-2">
            <div class="py-2 h5"><b>Q. which option best describes your job role?</b></div>
            <div class="ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3" id="options">
                <label class="options">Small Business Owner or Employee <input type="radio" name="question2"> <span class="checkmark"></span> </label>
                <label class="options">Nonprofit Owner or Employee <input type="radio" name="question2"> <span class="checkmark"></span> </label>
                <label class="options">Journalist or Activist <input type="radio" name="question2"> <span class="checkmark"></span> </label>
                <label class="options">Other <input type="radio" name="question2"> <span class="checkmark"></span> </label>

            </div>
        </div>
    </div>


    <div class="container mt-sm-5 my-1">
        <div class="d-flex align-items-center pt-3">
            <!-- <div id="prev"> <button class="btn btn-primary">Previous</button> </div> -->
            <div class=""> <button class="btn btn-success">Zatwierdź</button> </div>
        </div>
    </div>

<%@include file="../dynamic/js.jspf"%>
