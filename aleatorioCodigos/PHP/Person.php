<?php
    class Person {
        public $name;
        public $age;

        public function __construct() {
            echo "<p>construction done!</p>";
        }

        public function __destruct() {
            echo "<p>destroing that shit!</p>";            
        }

        public function printSomething() {
            echo 'printed <br>';
        }

        function inverse($x) {
            if (!$x) {
                throw new Exception('Division by zero.');
            }
            return 1/$x;
        }
    }
?>