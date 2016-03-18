
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object interns_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class interns extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Intern],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(internList:List[Intern]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<h1 style="color:red!important;">Intern Details</h1>
<h2 style="color:red!important;">total no of interns ---"""),_display_(/*3.58*/internList/*3.68*/.length),format.raw/*3.75*/("""</h2>
<table class="table"style="border:2px solid!important;">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th></th>

        <th></th>

    </tr>
    </thead>
    <tbody>

            """),_display_(/*18.14*/for(intern<-internList) yield /*18.37*/{_display_(Seq[Any](format.raw/*18.38*/("""
        """),format.raw/*19.9*/("""<tr><td>"""),_display_(/*19.18*/intern/*19.24*/.id),format.raw/*19.27*/("""</td>
               <td>"""),_display_(/*20.21*/intern/*20.27*/.name),format.raw/*20.32*/("""</td>
              <td>"""),_display_(/*21.20*/intern/*21.26*/.email),format.raw/*21.32*/("""</td>
             <td><a href="">Edit</a></td>
            <td><a href="">Delete</a></td>
         </tr>
    """)))}),format.raw/*25.6*/("""

    """),format.raw/*27.5*/("""</tbody>
</table>
</div>
"""))
      }
    }
  }

  def render(internList:List[Intern]): play.twirl.api.HtmlFormat.Appendable = apply(internList)

  def f:((List[Intern]) => play.twirl.api.HtmlFormat.Appendable) = (internList) => apply(internList)

  def ref: this.type = this

}


}

/**/
object interns extends interns_Scope0.interns
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/interns.scala.html
                  HASH: f65312bfc067b4637c3a92c9d48f79ca0ff7b75e
                  MATRIX: 537->1|657->26|684->27|820->137|838->147|865->154|1128->390|1167->413|1206->414|1242->423|1278->432|1293->438|1317->441|1370->467|1385->473|1411->478|1463->503|1478->509|1505->515|1646->626|1679->632
                  LINES: 20->1|25->1|26->2|27->3|27->3|27->3|42->18|42->18|42->18|43->19|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|49->25|51->27
                  -- GENERATED --
              */
          