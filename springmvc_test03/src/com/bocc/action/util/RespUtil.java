package com.bocc.action.util;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;


/**
 * HttpServletResponseå¸®åŠ©ç±?
 * 
 * @author lyl
 * 
 */
public final class RespUtil {

	/**
	 * å‘é?æ–‡æœ¬ã?‚ä½¿ç”¨UTF-8ç¼–ç ã€?
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param text
	 *            å‘é?çš„å­—ç¬¦ä¸?
	 */
	public static void renderText(HttpServletResponse response, String text) {
		render(response, "text/plain;charset=UTF-8", text);
	}

	/**
	 * å‘é?jsonã€‚ä½¿ç”¨UTF-8ç¼–ç ã€?
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param text
	 *            å‘é?çš„å­—ç¬¦ä¸?
	 */
	public static void renderJson(HttpServletResponse response, String text) {
		render(response, "application/json;charset=UTF-8", text);
	}

	/**
	 * å‘é?xmlã€‚ä½¿ç”¨UTF-8ç¼–ç ã€?
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param text
	 *            å‘é?çš„å­—ç¬¦ä¸?
	 */
	public static void renderXml(HttpServletResponse response, String text) {
		render(response, "text/xml;charset=UTF-8", text);
	}

	/**
	 * å‘é?å†…å®¹ã?‚ä½¿ç”¨UTF-8ç¼–ç ã€?
	 * 
	 * @param response
	 * @param contentType
	 * @param text
	 */
	public static void render(HttpServletResponse response, String contentType,
			String text) {
		response.setContentType(contentType);
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(text);
			response.getWriter().flush();
		} catch (IOException e) {
			
		}
	}
}
