<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head profile="http://selenium-ide.openqa.org/profiles/test-case">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="selenium.base" href="http://localhost:8080/" />
<title>TesteSoma</title>
</head>
<body>
<table cellpadding="1" cellspacing="1" border="1">
<thead>
<tr><td rowspan="1" colspan="3">TesteSoma</td></tr>
</thead><tbody>
<tr>
	<td>open</td>
	<td>/SomarParcelas/</td>
	<td></td>
</tr>
<tr>
	<td>type</td>
	<td>name=p1</td>
	<td>11</td>
</tr>
<tr>
	<td>type</td>
	<td>name=p2</td>
	<td>12</td>
</tr>
<tr>
	<td>clickAndWait</td>
	<td>name=calcular</td>
	<td></td>
</tr>
<tr>
	<td>assertText</td>
	<td>css=h1</td>
	<td>O resultado foi 23</td>
</tr>

</tbody></table>
</body>
</html>
