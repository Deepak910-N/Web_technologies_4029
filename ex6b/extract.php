<?php
$xml = simplexml_load_file("data.xml") or die("Error: Cannot load XML file");
echo "<h1>Olympic Events</h1>";
echo "<table border='1'>";
echo "<tr><th>Event Name</th><th>Venue</th><th>Participants</th></tr>";
foreach ($xml->event as $event) {
    echo "<tr>";
    echo "<td>" . $event->name . "</td>";
    echo "<td>" . $event->venue . "</td>";
    echo "<td>" . $event->participants . "</td>";
    echo "</tr>";
}
echo "</table>";
?>
