package mystruts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mystruts.actionForm.ProductForm;
import mystruts.model.Product;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SaveProductAction extends Action {

	/**
	 * 在客户端访问saveProduct动作时执行该方法
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ProductForm saveProductForm = (ProductForm)form;
		Product product;
		try {
			product = new Product(saveProductForm);
			product.save();
			request.setAttribute("info", "Save success!");
		} catch (Exception e) {
			request.setAttribute("info", e.getMessage());
		}
		
		return mapping.findForward("save");
	}
}
