package org.springframework.security.saml.web.handlers;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by izeidman on 10/30/2016.
 */
public class SuccessHandlerSp1 implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setStatus(200);
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getOutputStream().print("Sp 1 successfully authenticated");
        httpServletResponse.getOutputStream().close();
    }
}
