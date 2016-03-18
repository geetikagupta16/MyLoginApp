
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminDashboard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object adminDashboard_Scope1 {
import b3.vertical.fieldConstructor

class adminDashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/()(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.27*/("""
"""),_display_(/*3.2*/main("Dashboard")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
"""),format.raw/*4.1*/("""<h1 style="color: red!important;">Welcome admin</h1>
<ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
    <li><a data-toggle="tab" href="#awards" id="award">Awards/Certificates</a></li>
    <li><a data-toggle="tab" href="#lang" id="language">Languages</a></li>
    <li><a data-toggle="tab" href="#assignment" id="assignments">Assignments</a></li>
    <li><a data-toggle="tab" href="#proglang" id="proglangs">Programming Languages</a></li>
    <li><a data-toggle="tab" href="#internDt" id="interndetails">Intern Details</a></li>
    <li><a href=""""),_display_(/*12.19*/routes/*12.25*/.DashboardController.logout),format.raw/*12.52*/("""">Sign out</a></li>

</ul>

<script>
$(document).ready(function()"""),format.raw/*17.29*/("""{"""),format.raw/*17.30*/("""
"""),format.raw/*18.1*/("""$('#award').click(function()"""),format.raw/*18.29*/("""{"""),format.raw/*18.30*/("""

"""),format.raw/*20.1*/("""$.get("/getAllAwards",function(data,status)"""),format.raw/*20.44*/("""{"""),format.raw/*20.45*/("""
"""),format.raw/*21.1*/("""$('#awardmenu').html(data);
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/(""");
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""");


$('#language').click(function()"""),format.raw/*26.32*/("""{"""),format.raw/*26.33*/("""

"""),format.raw/*28.1*/("""$.get("/getAllLanguages",function(data,status)"""),format.raw/*28.47*/("""{"""),format.raw/*28.48*/("""
"""),format.raw/*29.1*/("""$('#langmenu').html(data);
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/(""");
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/(""");

$('#proglangs').click(function()"""),format.raw/*33.33*/("""{"""),format.raw/*33.34*/("""

"""),format.raw/*35.1*/("""$.get("/getAllProgLanguages",function(data,status)"""),format.raw/*35.51*/("""{"""),format.raw/*35.52*/("""
"""),format.raw/*36.1*/("""$('#proglangmenu').html(data);
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/(""");
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/(""");


$('#assignments').click(function()"""),format.raw/*41.35*/("""{"""),format.raw/*41.36*/("""

"""),format.raw/*43.1*/("""$.get("/getAllAssignments",function(data,status)"""),format.raw/*43.49*/("""{"""),format.raw/*43.50*/("""
"""),format.raw/*44.1*/("""$('#assignmentmenu').html(data);
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/(""");
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/(""");


$('#interndetails').click(function()"""),format.raw/*49.37*/("""{"""),format.raw/*49.38*/("""

"""),format.raw/*51.1*/("""$.get("/getAllInterns",function(data,status)"""),format.raw/*51.45*/("""{"""),format.raw/*51.46*/("""
"""),format.raw/*52.1*/("""$('#internmenu').html(data);
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/(""");
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/(""");

"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/(""");

</script>

<div class="tab-content">
    <div id="home" class="tab-pane fade in active">
        <h3>HOME</h3>
        <p>Some content.</p>
    </div>
    <div id="awards" class="tab-pane fade">
        <div id="awardmenu">

        </div>

    </div>

    <div id="lang" class="tab-pane fade">
        <div id="langmenu">

        </div>

    </div>

    <div id="assignment" class="tab-pane fade">
        <div id="assignmentmenu">

        </div>

    </div>

    <div id="proglang" class="tab-pane fade">
        <div id="proglangmenu">

        </div>

    </div>
    <div id="internDt" class="tab-pane fade">
        <div id="internmenu">

        </div>

</div>
    </div>
""")))}))
      }
    }
  }

  def render(flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(flash)

  def f:(() => (Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (flash) => apply()(flash)

  def ref: this.type = this

}


}
}

/**/
object adminDashboard extends adminDashboard_Scope0.adminDashboard_Scope1.adminDashboard
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/adminDashboard.scala.html
                  HASH: aa22273c6b35d34ea331ecf081bf339230097cb5
                  MATRIX: 617->38|737->63|764->65|789->82|828->84|855->85|1476->679|1491->685|1539->712|1632->777|1661->778|1689->779|1745->807|1774->808|1803->810|1874->853|1903->854|1931->855|1986->883|2014->884|2044->887|2072->888|2136->924|2165->925|2194->927|2268->973|2297->974|2325->975|2379->1002|2407->1003|2437->1006|2465->1007|2529->1043|2558->1044|2587->1046|2665->1096|2694->1097|2722->1098|2780->1129|2808->1130|2838->1133|2866->1134|2933->1173|2962->1174|2991->1176|3067->1224|3096->1225|3124->1226|3184->1259|3212->1260|3242->1263|3270->1264|3339->1305|3368->1306|3397->1308|3469->1352|3498->1353|3526->1354|3582->1383|3610->1384|3640->1387|3668->1388|3699->1392|3727->1393
                  LINES: 23->2|28->2|29->3|29->3|29->3|30->4|38->12|38->12|38->12|43->17|43->17|44->18|44->18|44->18|46->20|46->20|46->20|47->21|48->22|48->22|49->23|49->23|52->26|52->26|54->28|54->28|54->28|55->29|56->30|56->30|57->31|57->31|59->33|59->33|61->35|61->35|61->35|62->36|63->37|63->37|64->38|64->38|67->41|67->41|69->43|69->43|69->43|70->44|71->45|71->45|72->46|72->46|75->49|75->49|77->51|77->51|77->51|78->52|79->53|79->53|80->54|80->54|82->56|82->56
                  -- GENERATED --
              */
          