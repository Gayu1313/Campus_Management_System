package com.campus.filter;

import jakarta.servlet.Servlet;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class LoggingFilter extends HttpFilter {
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
  
        System.out.println("Request received");
        
        // Continue with the next filter or the target servlet
        chain.doFilter(request, response);
        
        // Log the response details
        System.out.println("Response sent");
    }
    
}
