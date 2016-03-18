
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateAward_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object updateAward_Scope1 {
import b3.vertical.fieldConstructor

class updateAward extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[Int, String, String]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(updateAwardForm:Form[(Int,String,String)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.84*/("""
"""),format.raw/*4.1*/("""<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Update Award Form</h1>

                """),_display_(/*9.18*/b3/*9.20*/.form(routes.DashboardController.updateAward)/*9.65*/ {_display_(Seq[Any](format.raw/*9.67*/("""
                """),_display_(/*10.18*/b3/*10.20*/.text(updateAwardForm("id"), '_label -> "S.no" )),format.raw/*10.68*/("""
                """),_display_(/*11.18*/b3/*11.20*/.text(updateAwardForm("name"), '_label -> "Name", '_help -> "" )),format.raw/*11.84*/("""
                """),_display_(/*12.18*/b3/*12.20*/.text(updateAwardForm("details"), '_label -> "Details", '_help -> "" )),format.raw/*12.90*/("""

                """),_display_(/*14.18*/b3/*14.20*/.submit('class -> "btn btn-default" ,'id->"updateAdd")/*14.74*/{_display_(Seq[Any](format.raw/*14.75*/(""" """),format.raw/*14.76*/("""UPDATE """)))}),format.raw/*14.84*/("""
                """)))}),format.raw/*15.18*/("""
            """),format.raw/*16.13*/("""</div>
             </div>

</div>


"""))
      }
    }
  }

  def render(updateAwardForm:Form[scala.Tuple3[Int, String, String]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(updateAwardForm)(message,flash)

  def f:((Form[scala.Tuple3[Int, String, String]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (updateAwardForm) => (message,flash) => apply(updateAwardForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object updateAward extends updateAward_Scope0.updateAward_Scope1.updateAward
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:58:28 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/updateAward.scala.html
                  HASH: 83bb651255572134f7bf3768ab50e11e53d136fe
                  MATRIX: 657->39|834->121|861->122|1078->313|1088->315|1141->360|1180->362|1225->380|1236->382|1305->430|1350->448|1361->450|1446->514|1491->532|1502->534|1593->604|1639->623|1650->625|1713->679|1752->680|1781->681|1820->689|1869->707|1910->720
                  LINES: 23->3|28->3|29->4|34->9|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|40->15|41->16
                  -- GENERATED --
              */
          