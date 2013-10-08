package main.java.com.fruitshop.back.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.fruitshop.cons.Conts;

public class UserFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		HttpSession session=request.getSession(true);
		String uri=request.getRequestURI();
		Object userCode=session.getAttribute(Conts.USER_CODE_FLAG);
		Object userAuth=session.getAttribute(Conts.USER_AUTH);
		if(uri.indexOf("logon.do")>0){//如果是登录界面就不拦截
			setEncode(request, response);
			arg2.doFilter(request, response);
			return;
		}
		if(userCode==null||userAuth==null){
			response.sendRedirect(request.getContextPath()+"/frt-bk-logon.do");
			return;
		}
		else{
			if(!Conts.USER_CODE.equals(userCode.toString())){
				response.sendRedirect(request.getContextPath()+"/frt-bk-logon.do");
				return;
			}
			setEncode(request, response);
			arg2.doFilter(request, response);
			return;
		}
	}

	/**
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException
	 */
	private void setEncode(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
