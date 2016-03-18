
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object assignment_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object assignment_Scope1 {
import b3.vertical.fieldConstructor

class assignment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Assignment],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(x:List[Assignment])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.61*/("""
"""),format.raw/*4.1*/("""<h1 style ="color:blue!important;">Assignments</h1>
<h2 style="color:red!important;">total no of assignment ---"""),_display_(/*5.61*/x/*5.62*/.length),format.raw/*5.69*/("""</h2>
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
         """),_display_(/*19.11*/for(asg<-x) yield /*19.22*/{_display_(Seq[Any](format.raw/*19.23*/("""
         """),format.raw/*20.10*/("""<tr><td>"""),_display_(/*20.19*/asg/*20.22*/.sno),format.raw/*20.26*/("""</td>
              <td>"""),_display_(/*21.20*/asg/*21.23*/.name),format.raw/*21.28*/("""</td>
             <td>"""),_display_(/*22.19*/asg/*22.22*/.date),format.raw/*22.27*/("""</td>

             <td>"""),_display_(/*24.19*/asg/*24.22*/.marks),format.raw/*24.28*/("""</td>
            <td>"""),_display_(/*25.18*/asg/*25.21*/.remarks),format.raw/*25.29*/("""</td>

                   </tr>
              """)))}),format.raw/*28.16*/("""

    """),format.raw/*30.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(x:List[Assignment],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(x)(message,flash)

  def f:((List[Assignment]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (x) => (message,flash) => apply(x)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object assignment extends assignment_Scope0.assignment_Scope1.assignment
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/assignment.scala.html
                  HASH: a36f5a3d32ca3875036433bf9d3da1dc191417d9
                  MATRIX: 631->39|785->98|812->99|950->211|959->212|986->219|1258->464|1285->475|1324->476|1362->486|1398->495|1410->498|1435->502|1487->527|1499->530|1525->535|1576->559|1588->562|1614->567|1666->592|1678->595|1705->601|1755->624|1767->627|1796->635|1874->682|1907->688
                  LINES: 23->3|28->3|29->4|30->5|30->5|30->5|44->19|44->19|44->19|45->20|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|49->24|49->24|49->24|50->25|50->25|50->25|53->28|55->30
                  -- GENERATED --
              */
          