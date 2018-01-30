<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>

<html:form>
	
	<pre>
		Name: <html:input path="name"/>
		Email: <html:input path="email"/>
		
		<input type="submit" value="submit">
	</pre>

</html:form>