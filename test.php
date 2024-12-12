// Vulnerable PHP code snippet
$ssn = $_POST['ssn'];
$query = "SELECT * FROM personal WHERE ssn LIKE '$ssn'";
$result = mysql_query($query);
