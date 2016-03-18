
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object login_Scope1 {
import b3.vertical.fieldConstructor

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Login],Messages,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm:Form[Login])(implicit message:Messages,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.64*/("""
"""),_display_(/*3.2*/main("Login Form")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
"""),format.raw/*4.1*/("""<div class="container" xmlns:border="http://www.w3.org/1999/xhtml" xmlns:color="http://www.w3.org/1999/xhtml"
     xmlns:colour="http://www.w3.org/1999/xhtml" xmlns:colour="http://www.w3.org/1999/xhtml"
     xmlns:colour="http://www.w3.org/1999/xhtml"/>
    <div class="jumbotron"style="border:2px solid blue">
        <h1 style="text-align:center;color:red!important;">INTERNS APP </h1>

<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Sign in</h1>
"""),_display_(/*14.2*/b3/*14.4*/.form(routes.LoginController.auth)/*14.38*/ {_display_(Seq[Any](format.raw/*14.40*/("""
"""),_display_(/*15.2*/b3/*15.4*/.email( loginForm("email"), '_label -> "Email", 'placeholder -> "example@mail.com" )),format.raw/*15.88*/("""
"""),_display_(/*16.2*/b3/*16.4*/.password( loginForm("password"), '_label -> "Password", 'placeholder -> "Password" )),format.raw/*16.89*/("""
"""),_display_(/*17.2*/b3/*17.4*/.submit('class -> "btn btn-default")/*17.40*/{_display_(Seq[Any](format.raw/*17.41*/(""" """),format.raw/*17.42*/("""Sign in """)))}),format.raw/*17.51*/("""

                """),format.raw/*19.17*/("""<div class="account-wall">
                    <label class="checkbox pull-left">
                        <input type="checkbox" value="remember-me">
                        Remember me
                    </label>
                    <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span>

                </div>


                <p>"""),_display_(/*29.21*/flash/*29.26*/.get("error")),format.raw/*29.39*/("""</p>

        </div>
    </div>
</div>
""")))}),format.raw/*34.2*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],message:Messages,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(message,flash)

  def f:((Form[Login]) => (Messages,Flash) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (message,flash) => apply(loginForm)(message,flash)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Mon Mar 14 10:10:12 IST 2016
                  SOURCE: /home/knoldus/Downloads/InternApp/bootstrapform/app/views/login.scala.html
                  HASH: 5564222f132a835bc5b1c3141e668714d2d67d2e
                  MATRIX: 611->38|768->100|795->102|821->120|859->121|886->122|1465->675|1475->677|1518->711|1558->713|1586->715|1596->717|1701->801|1729->803|1739->805|1845->890|1873->892|1883->894|1928->930|1967->931|1996->932|2036->941|2082->959|2477->1327|2491->1332|2525->1345|2595->1385
                  LINES: 23->2|28->2|29->3|29->3|29->3|30->4|40->14|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|43->17|43->17|43->17|43->17|43->17|43->17|45->19|55->29|55->29|55->29|60->34
                  -- GENERATED --
              */
          