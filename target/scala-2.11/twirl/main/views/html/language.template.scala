
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object language_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object language_Scope1 {
import b3.vertical.fieldConstructor

class language extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Language],Form[scala.Tuple2[String, String]],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(languages:List[Language],addLangForm:Form[(String,String)])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.101*/("""
"""),format.raw/*4.1*/("""<h3 style="color:green!important;">Languages</h3>
<h2 style="color:red!important;">total no of languages ---"""),_display_(/*5.60*/languages/*5.69*/.length),format.raw/*5.76*/("""</h2>
<table class="table"style="border:2px solid!important;">
    <thead>
    <tr>
        <th>Sno</th>

        <th>Languages Known</th>
        <th>Fluency</th>
        <th></th>

        <th></th>

    </tr>
    </thead>
    <tbody>

              """),_display_(/*21.16*/for(internLang<-languages) yield /*21.42*/{_display_(Seq[Any](format.raw/*21.43*/("""
             """),format.raw/*22.14*/("""<tr>                 <td>"""),_display_(/*22.40*/internLang/*22.50*/.sno),format.raw/*22.54*/("""</td>

                 <td>"""),_display_(/*24.23*/internLang/*24.33*/.known),format.raw/*24.39*/("""</td>
                   <td>"""),_display_(/*25.25*/internLang/*25.35*/.fluency),format.raw/*25.43*/("""</td>
                 <td><a href=""""),_display_(/*26.32*/routes/*26.38*/.DashboardController.editLanguage(internLang.sno)),format.raw/*26.87*/("""">Edit</a></td>
                 <td><a href=""""),_display_(/*27.32*/routes/*27.38*/.DashboardController.deleteLanguage(internLang.sno)),format.raw/*27.89*/("""">Delete</a></td>
             </tr>
        """)))}),format.raw/*29.10*/("""


    """),format.raw/*32.5*/("""</tbody>
</table>

<div id="languageModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Add Languages</h4>
            </div>
            <div class="modal-body">
                """),_display_(/*45.18*/b3/*45.20*/.form(routes.DashboardController.addLanguage)/*45.65*/ {_display_(Seq[Any](format.raw/*45.67*/("""
                """),_display_(/*46.18*/b3/*46.20*/.text(addLangForm("lang"), '_label -> "Language", '_help -> "Input  language name" )),format.raw/*46.104*/("""
                """),_display_(/*47.18*/b3/*47.20*/.text(addLangForm("fluency"), '_label -> "Fluency", '_help -> "" )),format.raw/*47.86*/("""
                """),_display_(/*48.18*/b3/*48.20*/.submit('class -> "btn btn-default")/*48.56*/{_display_(Seq[Any](format.raw/*48.57*/(""" """),format.raw/*48.58*/("""ADD """)))}),format.raw/*48.63*/("""
                """)))}),format.raw/*49.18*/("""
            """),format.raw/*50.13*/("""</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#languageModal">ADD</button>

<!-- Modal -->
"""))
      }
    }
  }

  def render(languages:List[Language],addLangForm:Form[scala.Tuple2[String, String]],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(languages,addLangForm)(message,flash)

  def f:((List[Language],Form[scala.Tuple2[String, String]]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (languages,addLangForm) => (message,flash) => apply(languages,addLangForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object language extends language_Scope0.language_Scope1.language
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:47:53 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/language.scala.html
                  HASH: 1ba14d4d4bc5a9610cf18e6b962071e32946d5c8
                  MATRIX: 658->39|853->138|880->139|1015->248|1032->257|1059->264|1339->517|1381->543|1420->544|1462->558|1515->584|1534->594|1559->598|1615->627|1634->637|1661->643|1718->673|1737->683|1766->691|1830->728|1845->734|1915->783|1989->830|2004->836|2076->887|2153->933|2187->940|2650->1376|2661->1378|2715->1423|2755->1425|2800->1443|2811->1445|2917->1529|2962->1547|2973->1549|3060->1615|3105->1633|3116->1635|3161->1671|3200->1672|3229->1673|3265->1678|3314->1696|3355->1709
                  LINES: 23->3|28->3|29->4|30->5|30->5|30->5|46->21|46->21|46->21|47->22|47->22|47->22|47->22|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|54->29|57->32|70->45|70->45|70->45|70->45|71->46|71->46|71->46|72->47|72->47|72->47|73->48|73->48|73->48|73->48|73->48|73->48|74->49|75->50
                  -- GENERATED --
              */
          