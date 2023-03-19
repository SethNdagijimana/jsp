<!DOCTYPE html>

<html lang="en-US">
    <head>
        <title>Student dashboard</title>
        <link rel="stylesheet" href="index.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
<script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
        <div class="hero">
            <nav>
                <img src="images/menu.png" class="menu-img">
                <img src="images/img.png" class="logo">
                <ul>
                    <li><a href="index.html">Courses</a></li>
                    <li><a href="about.html">About</a></li>
                    <li><a href="signup.html">contact</a></li>
                    <li><a href="login.jsp">logout</a></li>
                </ul>
                
                <button type="button" onclick="toggleBtn()" id="btn"><span></span></button>
            </nav>


            <div class="lamp-container">
                <img src="images/lamp.png" class="lamp">
                <img src="images/light.png" class="light" id="light">

            </div>

            <div class="text-container">
                <h1>Coding</h1>
                <p>code using java and javascript anytime anywhere</p>
                <a href="signup.html">Welcome To your Dashboard</a>
                <div class="control">
                    <p>04</p>
                    <div class="line"><span></span></div>
                    <p>05</p>
                    <div id="google_translate_element"></div>
  
                </div>
            </div>
        </div>
  <script type="text/javascript"> 
    function googleTranslateElementInit() {
    new google.translate.TranslateElement({pageLanguage: 'en'}, 'google_translate_element');
    }   
        </script>
        <script>
            var btn = document.getElementById("btn");
            var on = document.getElementById("light");

            function toggleBtn(){
                btn.classList.toggle("active");
                on.classList.toggle("on");
            }
        </script>
    </body>
</html>
