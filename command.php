// Vulnerable PHP code snippet
<?php
    $command = $_GET['cmd'];
    exec($command);
?>
