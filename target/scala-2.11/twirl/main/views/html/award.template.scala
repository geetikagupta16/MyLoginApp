
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object award_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object award_Scope1 {
import b3.vertical.fieldConstructor

class award extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Award],Form[scala.Tuple3[Int, String, String]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(x:List[Award],addAwardForm:Form[(Int,String,String)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.95*/("""
"""),format.raw/*4.1*/("""<h3 style="color:red!important;">Awards/Certificates</h3>
    <table class="table"style="border:2px solid!important;">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Details</th>
            <th>Intern Id</th>

            <th></th>

            <th></th>

        </tr>
        </thead>
        <tbody>

             """),_display_(/*21.15*/for(award<-x) yield /*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
            """),format.raw/*22.13*/("""<tr><td id="awardId">"""),_display_(/*22.35*/award/*22.40*/.id),format.raw/*22.43*/("""</td>
                   <td>"""),_display_(/*23.25*/award/*23.30*/.name),format.raw/*23.35*/("""</td>
                  <td>"""),_display_(/*24.24*/award/*24.29*/.details),format.raw/*24.37*/("""</td>
                <td>"""),_display_(/*25.22*/award/*25.27*/.internId),format.raw/*25.36*/("""</td>

                <td><a href=""""),_display_(/*27.31*/routes/*27.37*/.DashboardController.editAward(award.id)),format.raw/*27.77*/("""" id="editAward">Edit</a></td>
                <td><a href=""""),_display_(/*28.31*/routes/*28.37*/.DashboardController.deleteAward(award.id)),format.raw/*28.79*/("""">Delete</a></td>
             </tr>
        """)))}),format.raw/*30.10*/("""

        """),format.raw/*32.9*/("""</tbody>
    </table>



    <div id="awardModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Add Awards/Certificates</h4>
                </div>
                <div class="modal-body">
                    """),_display_(/*47.22*/b3/*47.24*/.form(routes.DashboardController.addAward)/*47.66*/ {_display_(Seq[Any](format.raw/*47.68*/("""
                    """),_display_(/*48.22*/b3/*48.24*/.text(addAwardForm("id"), '_label -> "S.no" )),format.raw/*48.69*/("""
                    """),_display_(/*49.22*/b3/*49.24*/.text(addAwardForm("name"), '_label -> "Name", '_help -> "" )),format.raw/*49.85*/("""
                    """),_display_(/*50.22*/b3/*50.24*/.text(addAwardForm("details"), '_label -> "Details", '_help -> "" )),format.raw/*50.91*/("""

                    """),_display_(/*52.22*/b3/*52.24*/.submit('class -> "btn btn-default" ,'id->"awardAdd")/*52.77*/{_display_(Seq[Any](format.raw/*52.78*/(""" """),format.raw/*52.79*/("""ADD """)))}),format.raw/*52.84*/("""
                    """)))}),format.raw/*53.22*/("""
                """),format.raw/*54.17*/("""</div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>

        </div>
    </div>
    <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#awardModal">Add</button>
"""))
      }
    }
  }

  def render(x:List[Award],addAwardForm:Form[scala.Tuple3[Int, String, String]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(x,addAwardForm)(message,flash)

  def f:((List[Award],Form[scala.Tuple3[Int, String, String]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (x,addAwardForm) => (message,flash) => apply(x,addAwardForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object award extends award_Scope0.award_Scope1.award
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:47:53 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/award.scala.html
                  HASH: 9e4d9d931bd616f3d759dc26c62a9541d49d8359
                  MATRIX: 651->39|839->132|866->133|1260->500|1289->513|1328->514|1369->527|1418->549|1432->554|1456->557|1513->587|1527->592|1553->597|1609->626|1623->631|1652->639|1706->666|1720->671|1750->680|1814->717|1829->723|1890->763|1978->824|1993->830|2056->872|2133->918|2170->928|2686->1417|2697->1419|2748->1461|2788->1463|2837->1485|2848->1487|2914->1532|2963->1554|2974->1556|3056->1617|3105->1639|3116->1641|3204->1708|3254->1731|3265->1733|3327->1786|3366->1787|3395->1788|3431->1793|3484->1815|3529->1832
                  LINES: 23->3|28->3|29->4|46->21|46->21|46->21|47->22|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|52->27|52->27|52->27|53->28|53->28|53->28|55->30|57->32|72->47|72->47|72->47|72->47|73->48|73->48|73->48|74->49|74->49|74->49|75->50|75->50|75->50|77->52|77->52|77->52|77->52|77->52|77->52|78->53|79->54
                  -- GENERATED --
              */
          