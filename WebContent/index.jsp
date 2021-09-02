

<html>

<head>
<link class="jsbin"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css"
	rel="stylesheet" type="text/css" />
<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>
<meta charset=utf-8 />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">


</head>

<body>
	<div class="container">

		<div class="row ">
			<div class="col-12">
				<nav class="navbar navbar-expand-lg navbar-light bg-light">
					<div class="container-fluid">
						<a class="navbar-brand" href="#">getColors</a>
						<button class="navbar-toggler" type="button"
							data-bs-toggle="collapse" data-bs-target="#navbarText"
							aria-controls="navbarText" aria-expanded="false"
							aria-label="Toggle navigation">
							<span class="navbar-toggler-icon"></span>
						</button>
						<div class="collapse navbar-collapse" id="navbarText">
							<ul class="navbar-nav me-auto mb-2 mb-lg-0">
								<li class="nav-item"><a class="nav-link active"
									aria-current="page" href="#">Home</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Features</a>
								</li>
								<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
								</li>
							</ul>
							<span class="navbar-text"> Project created and maintened
								by open source students<br />
							</span>
						</div>
					</div>
				</nav>
			</div>
		</div>


		<div class="row text-center">
            <div class="col-12">
                <br />
                <h1>Choose an image to get the colors!</h1>
                <p><i>PNG JPG JPEG</i></p>

                <div class="custom-file-upload">
                   <form action="FileUploadHandler" enctype="multipart/form-data" method="post">

				 <input type="file" name="file2" /><br>
               <input type="submit" value="upload" />
           </form>  
           <%
           String file_name=(String)request.getParameter("filename");
           if(file_name!=null){
        	   out.println(file_name+" File uploaded successfuly");
 	        %><br>
        		<img src="http://localhost:8080/uploaded_files/<%=file_name%>">
           <%	   
        	   
           }
           %>
                </div>
            </div>
        
				

		</div>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous">
		
	</script>
	<script src="assets/script.js"></script>
</body>

</html>