
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <link rel='stylesheet' href='"""),_display_(/*10.39*/routes/*10.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*10.107*/("""'>
        <script type='text/javascript' src='"""),_display_(/*11.46*/routes/*11.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*11.106*/("""'></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>
    </head>
    <body>
     <div class="panel panel-default">
    <nav class="navbar navbar-default"style="background-color: red!important;">
  <div class="container-fluid"style="border:2px solid;">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Knoldus</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#" style="background-color: red!important;">Home</a></li>
      <li><a href="#">Main</a></li>
      <li><a href="#">Content</a></li>
      <li><a href="#">About Us</a></li>
    </ul>
  </div>
</nav>
<div>"""),_display_(/*31.7*/content),format.raw/*31.14*/("""</div>


  <div class="panel-footer">@Copyright reserved</div>
</div>
    </body>
</html>


    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/main.scala.html
                  HASH: fdf7d81e7f523c6f9c7a4d5b228044123f3d1835
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|883->161|897->167|959->208|1046->269|1060->275|1120->314|1188->355|1203->361|1287->423|1362->471|1377->477|1453->531|1711->762|1726->768|1788->809|2413->1408|2441->1415
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|38->14|55->31|55->31
                  -- GENERATED --
              */
          