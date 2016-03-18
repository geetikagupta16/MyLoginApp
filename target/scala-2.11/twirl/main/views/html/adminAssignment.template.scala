
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminAssignment_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object adminAssignment_Scope1 {
import b3.vertical.fieldConstructor

class adminAssignment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Assignment],Form[scala.Tuple5[String, String, Int, String, Int]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(x:List[Assignment],addAssignmentForm:Form[(String,String,Int,String,Int)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.116*/("""
"""),format.raw/*4.1*/("""<h3 style="color:red!important;">Assignments</h3>
<table class="table"style="border:2px solid!important;">
    <thead>
    <tr>
        <th>S.no</th>
        <th>Name</th>
        <th>Date</th>
        <th>Marks</th>
        <th>Remarks</th>


    </tr>
    </thead>
    <tbody>
    """),_display_(/*18.6*/for(asg<-x) yield /*18.17*/{_display_(Seq[Any](format.raw/*18.18*/("""
    """),format.raw/*19.5*/("""<tr><td>"""),_display_(/*19.14*/asg/*19.17*/.sno),format.raw/*19.21*/("""</td>
        <td>"""),_display_(/*20.14*/asg/*20.17*/.name),format.raw/*20.22*/("""</td>
        <td>"""),_display_(/*21.14*/asg/*21.17*/.date),format.raw/*21.22*/("""</td>

        <td>"""),_display_(/*23.14*/asg/*23.17*/.marks),format.raw/*23.23*/("""</td>
        <td>"""),_display_(/*24.14*/asg/*24.17*/.remarks),format.raw/*24.25*/("""</td>
        <td>"""),_display_(/*25.14*/asg/*25.17*/.internId),format.raw/*25.26*/("""</td>


    </tr>
    """)))}),format.raw/*29.6*/("""

    """),format.raw/*31.5*/("""</tbody>
</table>

<div id="assignmentModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Add Assignment</h4>
            </div>
            <div class="modal-body">
                """),_display_(/*44.18*/b3/*44.20*/.form(routes.DashboardController.addAssignment)/*44.67*/ {_display_(Seq[Any](format.raw/*44.69*/("""

                """),_display_(/*46.18*/b3/*46.20*/.text(addAssignmentForm("name"), '_label -> "Name" )),format.raw/*46.72*/("""
                """),_display_(/*47.18*/b3/*47.20*/.date(addAssignmentForm("date"), '_label -> "Date", '_help -> "" )),format.raw/*47.86*/("""
                """),_display_(/*48.18*/b3/*48.20*/.text(addAssignmentForm("marks"), '_label -> "Marks", '_help -> "" )),format.raw/*48.88*/("""
                """),_display_(/*49.18*/b3/*49.20*/.text(addAssignmentForm("remarks"), '_label -> "Remarks", '_help -> "" )),format.raw/*49.92*/("""
                """),_display_(/*50.18*/b3/*50.20*/.text(addAssignmentForm("internId"), '_label -> "Intern ID", '_help -> "" )),format.raw/*50.95*/("""

                """),_display_(/*52.18*/b3/*52.20*/.submit('class -> "btn btn-default")/*52.56*/{_display_(Seq[Any](format.raw/*52.57*/(""" """),format.raw/*52.58*/("""ADD """)))}),format.raw/*52.63*/("""
                """)))}),format.raw/*53.18*/("""
            """),format.raw/*54.13*/("""</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#assignmentModal">Add</button>

"""))
      }
    }
  }

  def render(x:List[Assignment],addAssignmentForm:Form[scala.Tuple5[String, String, Int, String, Int]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(x,addAssignmentForm)(message,flash)

  def f:((List[Assignment],Form[scala.Tuple5[String, String, Int, String, Int]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (x,addAssignmentForm) => (message,flash) => apply(x,addAssignmentForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object adminAssignment extends adminAssignment_Scope0.adminAssignment_Scope1.adminAssignment
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/adminAssignment.scala.html
                  HASH: c43d4c52066800a9f3e035b22866824bc086b64c
                  MATRIX: 699->39|909->153|936->154|1246->438|1273->449|1312->450|1344->455|1380->464|1392->467|1417->471|1463->490|1475->493|1501->498|1547->517|1559->520|1585->525|1632->545|1644->548|1671->554|1717->573|1729->576|1758->584|1804->603|1816->606|1846->615|1899->638|1932->644|2398->1083|2409->1085|2465->1132|2505->1134|2551->1153|2562->1155|2635->1207|2680->1225|2691->1227|2778->1293|2823->1311|2834->1313|2923->1381|2968->1399|2979->1401|3072->1473|3117->1491|3128->1493|3224->1568|3270->1587|3281->1589|3326->1625|3365->1626|3394->1627|3430->1632|3479->1650|3520->1663
                  LINES: 23->3|28->3|29->4|43->18|43->18|43->18|44->19|44->19|44->19|44->19|45->20|45->20|45->20|46->21|46->21|46->21|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|54->29|56->31|69->44|69->44|69->44|69->44|71->46|71->46|71->46|72->47|72->47|72->47|73->48|73->48|73->48|74->49|74->49|74->49|75->50|75->50|75->50|77->52|77->52|77->52|77->52|77->52|77->52|78->53|79->54
                  -- GENERATED --
              */
          