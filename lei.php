// ** **Dummy Vulnerable Code for LFI and Command Injection in PHP**

### Local File Inclusion (LFI) Vulnerability

Here's an example of a vulnerable PHP code snippet that includes a file based on user input:

```php
// Vulnerable PHP code snippet
<?php
    $file = $_GET['file'];
    include($file . '.php');
?>
