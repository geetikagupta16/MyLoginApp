
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateProgLang_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object updateProgLang_Scope1 {
import b3.vertical.fieldConstructor

class updateProgLang extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[Int, String, String]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(updateProgLangForm:Form[(Int,String,String)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.87*/("""
"""),format.raw/*4.1*/("""<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Update Programming Language Form</h1>

            """),_display_(/*9.14*/b3/*9.16*/.form(routes.DashboardController.updateProgLanguage)/*9.68*/ {_display_(Seq[Any](format.raw/*9.70*/("""
            """),_display_(/*10.14*/b3/*10.16*/.text(updateProgLangForm("sno"), '_label -> "Sno")),format.raw/*10.66*/("""

            """),_display_(/*12.14*/b3/*12.16*/.text(updateProgLangForm("lang"), '_label -> " Programming Language", '_help -> "Input  language name" )),format.raw/*12.120*/("""
            """),_display_(/*13.14*/b3/*13.16*/.text(updateProgLangForm("fluency"), '_label -> "Fluency", '_help -> "" )),format.raw/*13.89*/("""
            """),_display_(/*14.14*/b3/*14.16*/.submit('class -> "btn btn-default")/*14.52*/{_display_(Seq[Any](format.raw/*14.53*/(""" """),format.raw/*14.54*/("""Update""")))}),format.raw/*14.61*/("""
            """)))}),format.raw/*15.14*/("""

        """),format.raw/*17.9*/("""</div>
    </div>

</div>


"""))
      }
    }
  }

  def render(updateProgLangForm:Form[scala.Tuple3[Int, String, String]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(updateProgLangForm)(message,flash)

  def f:((Form[scala.Tuple3[Int, String, String]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (updateProgLangForm) => (message,flash) => apply(updateProgLangForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object updateProgLang extends updateProgLang_Scope0.updateProgLang_Scope1.updateProgLang
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:58:28 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/updateProgLang.scala.html
                  HASH: a80d4892142020f914e037b8b52ea24eeed7be95
                  MATRIX: 666->39|846->124|873->125|1101->327|1111->329|1171->381|1210->383|1251->397|1262->399|1333->449|1375->464|1386->466|1512->570|1553->584|1564->586|1658->659|1699->673|1710->675|1755->711|1794->712|1823->713|1861->720|1906->734|1943->744
                  LINES: 23->3|28->3|29->4|34->9|34->9|34->9|34->9|35->10|35->10|35->10|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|39->14|40->15|42->17
                  -- GENERATED --
              */
          