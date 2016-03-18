
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object dashboard_Scope1 {
import b3.vertical.fieldConstructor

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Dashboard")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
"""),format.raw/*3.1*/("""<ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
    <li><a data-toggle="tab" href="#awards" id="award">Awards/Certificates</a></li>
    <li><a data-toggle="tab" href="#lang" id="language">Languages</a></li>
    <li><a data-toggle="tab" href="#assignment" id="assignments">Assignments</a></li>
    <li><a data-toggle="tab" href="#proglang" id="progLanguages">Programming Languages</a></li>
<li><a href=""""),_display_(/*9.15*/routes/*9.21*/.DashboardController.logout),format.raw/*9.48*/("""">Sign out</a></li>

</ul>
<script>


$(document).ready(function()"""),format.raw/*15.29*/("""{"""),format.raw/*15.30*/("""
"""),format.raw/*16.1*/("""$('#award').click(function()"""),format.raw/*16.29*/("""{"""),format.raw/*16.30*/("""

"""),format.raw/*18.1*/("""$.get("/getawards",function(data,status)"""),format.raw/*18.41*/("""{"""),format.raw/*18.42*/("""
"""),format.raw/*19.1*/("""$('#awardmenu').html(data);
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/(""");
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/(""");

$('#language').click(function()"""),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""
"""),format.raw/*24.1*/("""$.get("/getlanguages",function(data,status)"""),format.raw/*24.44*/("""{"""),format.raw/*24.45*/("""
"""),format.raw/*25.1*/("""$('#languageMenu').html(data);

"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/(""");
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/(""");

$('#assignments').click(function()"""),format.raw/*30.35*/("""{"""),format.raw/*30.36*/("""
"""),format.raw/*31.1*/("""$.get("/getassignments",function(data,status)"""),format.raw/*31.46*/("""{"""),format.raw/*31.47*/("""
"""),format.raw/*32.1*/("""$('#assignmentMenu').html(data);

"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/(""");
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/(""");


$('#progLanguages').click(function()"""),format.raw/*38.37*/("""{"""),format.raw/*38.38*/("""
"""),format.raw/*39.1*/("""$.get("/getproglanguages",function(data,status)"""),format.raw/*39.48*/("""{"""),format.raw/*39.49*/("""
"""),format.raw/*40.1*/("""$('#progLangMenu').html(data);

"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/(""");
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/(""");

"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/(""");

</script>



<div class="tab-content">
    <div id="home" class="tab-pane fade in active">
        <h3>HOME</h3>
        <p>Some content.</p>
    </div>
    <div id="awards" class="tab-pane fade">
        <div id="awardmenu">

        </div>

        <!-- Modal -->

    </div>
    <div id="lang" class="tab-pane fade">
<div id="languageMenu">

</div>
    </div>

    <div id="assignment" class="tab-pane fade">
<div id="assignmentMenu">

</div>
    </div>

    <div id="proglang" class="tab-pane fade">
<div id="progLangMenu">

</div>
</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object dashboard extends dashboard_Scope0.dashboard_Scope1.dashboard
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/dashboard.scala.html
                  HASH: 413b19f0051020a69d187c596a22496a595152a7
                  MATRIX: 685->38|710->55|749->57|776->58|1254->510|1268->516|1315->543|1409->609|1438->610|1466->611|1522->639|1551->640|1580->642|1648->682|1677->683|1705->684|1760->712|1788->713|1818->716|1846->717|1909->752|1938->753|1966->754|2037->797|2066->798|2094->799|2153->831|2181->832|2211->835|2239->836|2305->874|2334->875|2362->876|2435->921|2464->922|2492->923|2553->957|2581->958|2611->961|2639->962|2708->1003|2737->1004|2765->1005|2840->1052|2869->1053|2897->1054|2956->1086|2984->1087|3014->1090|3042->1091|3073->1095|3101->1096
                  LINES: 28->2|28->2|28->2|29->3|35->9|35->9|35->9|41->15|41->15|42->16|42->16|42->16|44->18|44->18|44->18|45->19|46->20|46->20|47->21|47->21|49->23|49->23|50->24|50->24|50->24|51->25|53->27|53->27|54->28|54->28|56->30|56->30|57->31|57->31|57->31|58->32|60->34|60->34|61->35|61->35|64->38|64->38|65->39|65->39|65->39|66->40|68->42|68->42|69->43|69->43|71->45|71->45
                  -- GENERATED --
              */
          