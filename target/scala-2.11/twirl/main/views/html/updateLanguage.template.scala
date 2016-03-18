
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateLanguage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object updateLanguage_Scope1 {
import b3.vertical.fieldConstructor

class updateLanguage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[Int, String, String]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(updateLangForm:Form[(Int,String,String)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.83*/("""
"""),format.raw/*4.1*/("""<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Update language Form</h1>


            """),_display_(/*10.14*/b3/*10.16*/.form(routes.DashboardController.updateLanguage)/*10.64*/ {_display_(Seq[Any](format.raw/*10.66*/("""
            """),_display_(/*11.14*/b3/*11.16*/.text(updateLangForm("sno"), '_label -> "Sno")),format.raw/*11.62*/("""

            """),_display_(/*13.14*/b3/*13.16*/.text(updateLangForm("lang"), '_label -> "Language", '_help -> "Input  language name" )),format.raw/*13.103*/("""
            """),_display_(/*14.14*/b3/*14.16*/.text(updateLangForm("fluency"), '_label -> "Fluency", '_help -> "" )),format.raw/*14.85*/("""
            """),_display_(/*15.14*/b3/*15.16*/.submit('class -> "btn btn-default")/*15.52*/{_display_(Seq[Any](format.raw/*15.53*/(""" """),format.raw/*15.54*/("""Update""")))}),format.raw/*15.61*/("""
            """)))}),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""</div>
    </div>

</div>


"""))
      }
    }
  }

  def render(updateLangForm:Form[scala.Tuple3[Int, String, String]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(updateLangForm)(message,flash)

  def f:((Form[scala.Tuple3[Int, String, String]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (updateLangForm) => (message,flash) => apply(updateLangForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object updateLanguage extends updateLanguage_Scope0.updateLanguage_Scope1.updateLanguage
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:58:28 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/updateLanguage.scala.html
                  HASH: 63ff7d6ee23179321dab48938d3339339658e3e6
                  MATRIX: 666->39|842->120|869->121|1087->312|1098->314|1155->362|1195->364|1236->378|1247->380|1314->426|1356->441|1367->443|1476->530|1517->544|1528->546|1618->615|1659->629|1670->631|1715->667|1754->668|1783->669|1821->676|1866->690|1902->699
                  LINES: 23->3|28->3|29->4|35->10|35->10|35->10|35->10|36->11|36->11|36->11|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|40->15|40->15|40->15|41->16|42->17
                  -- GENERATED --
              */
          