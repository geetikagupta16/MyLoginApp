package controllers


import models.Login
import play.api._
import play.api.mvc._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class Application extends Controller {

  val loginForm = Form(
    mapping(
      "email" -> email,
      "password" -> nonEmptyText(minLength = 5)
    )(Login.apply)(Login.unapply)
  )

  def index = Action { implicit request=>
    Ok(views.html.login(loginForm))
  }



}
