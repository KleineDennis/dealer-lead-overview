package controllers

import javax.inject._

import com.duosecurity.duoweb.DuoWeb
import models.Lead
import play.api._
import play.api.libs.json.Json
import play.api.mvc._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  implicit val carFormat = Json.format[Lead]

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def login() = Action { implicit request: Request[AnyContent] =>

    val ikey = "DI84HZNK6Z63MGBVS4AE"
    val skey = "hZaMb8KpJP9Tm4ml4OpB5dnBZ1y8q7FYD7CnKpkn"
    val akey = "9ff92a3b9caea030f526fe285c4d41f42eab8531"
    val username = "dkleine"
    val sig_request = DuoWeb.signRequest(ikey, skey, akey, username)

    Ok(views.html.login(sig_request, 2120049956))
  }

  def list(dealerId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.list(Lead.findAll(dealerId)))
  }
}
