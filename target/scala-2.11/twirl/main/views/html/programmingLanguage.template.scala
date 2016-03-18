
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object programmingLanguage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object programmingLanguage_Scope1 {
import b3.vertical.fieldConstructor

class programmingLanguage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[ProgLanguage],Form[scala.Tuple2[String, String]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(progLang:List[ProgLanguage],addProgForm:Form[(String,String)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.104*/("""
"""),format.raw/*4.1*/("""<h3 style="color:green!important;">Programming Languages</h3>
<h2 style="color:red!important;">total no of programmingLanguages ---"""),_display_(/*5.71*/progLang/*5.79*/.length),format.raw/*5.86*/("""</h2>
<table class="table" style="border:2px solid!important;">
    <thead>
    <tr>
        <th>S.no</th>
        <th>Name</th>
        <th>Fluency</th>
        <th></th>

        <th></th>

    </tr>
    </thead>
    <tbody>

              """),_display_(/*20.16*/for(plang<-progLang) yield /*20.36*/{_display_(Seq[Any](format.raw/*20.37*/("""
             """),format.raw/*21.14*/("""<tr><td>"""),_display_(/*21.23*/plang/*21.28*/.sno),format.raw/*21.32*/("""</td>
                    <td>"""),_display_(/*22.26*/plang/*22.31*/.known),format.raw/*22.37*/("""</td>
                   <td>"""),_display_(/*23.25*/plang/*23.30*/.fluency),format.raw/*23.38*/("""</td>
                 <td><a href=""""),_display_(/*24.32*/routes/*24.38*/.DashboardController.editProgLanguage(plang.sno)),format.raw/*24.86*/("""">Edit</a></td>
                 <td><a href=""""),_display_(/*25.32*/routes/*25.38*/.DashboardController.deleteProgLanguage(plang.sno)),format.raw/*25.88*/("""">Delete</a></td>

                   </tr>
           """)))}),format.raw/*28.13*/("""

    """),format.raw/*30.5*/("""</tbody>
</table>
<div id="progLangModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Add Programming Languages</h4>
            </div>
            <div class="modal-body">
                """),_display_(/*42.18*/b3/*42.20*/.form(routes.DashboardController.addProgLanguage)/*42.69*/ {_display_(Seq[Any](format.raw/*42.71*/("""
                """),_display_(/*43.18*/b3/*43.20*/.text(addProgForm("langName"), '_label -> "Language", '_help -> "Input  language name" )),format.raw/*43.108*/("""
                """),_display_(/*44.18*/b3/*44.20*/.text(addProgForm("fluency"), '_label -> "Level", '_help -> "" )),format.raw/*44.84*/("""
                """),_display_(/*45.18*/b3/*45.20*/.submit('class -> "btn btn-default")/*45.56*/{_display_(Seq[Any](format.raw/*45.57*/(""" """),format.raw/*45.58*/("""ADD """)))}),format.raw/*45.63*/("""
                """)))}),format.raw/*46.18*/("""
            """),format.raw/*47.13*/("""</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#progLangModal">Add</button>

<!-- Modal -->

</div>
"""))
      }
    }
  }

  def render(progLang:List[ProgLanguage],addProgForm:Form[scala.Tuple2[String, String]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(progLang,addProgForm)(message,flash)

  def f:((List[ProgLanguage],Form[scala.Tuple2[String, String]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (progLang,addProgForm) => (message,flash) => apply(progLang,addProgForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object programmingLanguage extends programmingLanguage_Scope0.programmingLanguage_Scope1.programmingLanguage
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:47:53 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/programmingLanguage.scala.html
                  HASH: bec7769662cced7c755d7c48d98c1631fd7335da
                  MATRIX: 695->39|893->141|920->142|1078->274|1094->282|1121->289|1391->532|1427->552|1466->553|1508->567|1544->576|1558->581|1583->585|1641->616|1655->621|1682->627|1739->657|1753->662|1782->670|1846->707|1861->713|1930->761|2004->808|2019->814|2090->864|2177->920|2210->926|2684->1373|2695->1375|2753->1424|2793->1426|2838->1444|2849->1446|2959->1534|3004->1552|3015->1554|3100->1618|3145->1636|3156->1638|3201->1674|3240->1675|3269->1676|3305->1681|3354->1699|3395->1712
                  LINES: 23->3|28->3|29->4|30->5|30->5|30->5|45->20|45->20|45->20|46->21|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|53->28|55->30|67->42|67->42|67->42|67->42|68->43|68->43|68->43|69->44|69->44|69->44|70->45|70->45|70->45|70->45|70->45|70->45|71->46|72->47
                  -- GENERATED --
              */
          