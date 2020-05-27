<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">

	<form:form method="post" action="add-todo"  modelAttribute="todo">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="desc">Description</form:label>
			<form:input path="desc" type="text" class="form-control" required="required" />
			<form:errors path="desc" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="targetDate">Target Date</form:label>
			<form:input path="targetDate" type="text" class="form-control" required="required" />
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>

		 <div class="form-buttons">
            <div class="button">
                <input type="submit" class="btn btn-success" id="save" value="Add"/>&#160;
                <a href="/list-todos" >Cancel</a>         
            </div>    
        </div>
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>