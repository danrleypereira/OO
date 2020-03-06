<html>
    <head>
    <title>PHP Test</title>
    </head>
    <body>
        <?php
            // include 'INI.class.php';

            // $ini = parse_ini_file("%d/config.ini");
            // $ini = new INI('config.ini');

            //constants 
            require './Person.php';

            define("AGE", 13);

            function helloBaby() {
                echo '<p>Hello baby</p>';
                // print_r($ini['db_name']);
                echo '<p>'. AGE .'</p>';
            }

            
            
            echo '<p>Hello World</p>'; 
            // phpinfo();
            echo $_SERVER['HTTP_USER_AGENT'];

            $obj = new Person();
            $obj->printSomething();
            call_user_func('helloBaby');
            call_user_func(array($obj, 'printSomething'));


            echo gettype($obj) . '</br>';
            

            print('something printed');

            try {
                echo '<p>' . $obj->inverse(5) . "</p>";
                echo $obj->inverse(0) . "\n";
                echo 3/0;
            } catch( Exception $e ) {
                echo '<p>Caugth exception: ' . $e->getMessage() . '</p>';
            } finally {
                echo '<p>bye bye try catch block!</p>';
            }
        ?> 
    </body>
</html>