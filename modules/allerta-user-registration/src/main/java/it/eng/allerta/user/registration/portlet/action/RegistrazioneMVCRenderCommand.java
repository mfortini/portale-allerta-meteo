package it.eng.allerta.user.registration.portlet.action;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import it.eng.allerta.utils.AllertaKeys;

@Component(
		immediate = true,
		property = { 
				"javax.portlet.name=" + AllertaKeys.AllertaUserRegistration,
				"mvc.command.name=/allerta/user-reg" 
		}, 
		service = MVCRenderCommand.class
)

public class RegistrazioneMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		return "/registrazione.jsp";
	}

}
