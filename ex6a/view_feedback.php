<?php
// Database connection
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "olympics_feedback";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT id, username, email, rating, comments, submitted_at FROM feedback ORDER BY submitted_at DESC";
$result = $conn->query($sql);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Olympics Feedback Overview</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #003366;
            color: #FFFFFF;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .table-container {
            background-color: #00509E;
            border: 2px solid #FFD700;
            padding: 20px;
            width: 90%;
            max-width: 1000px;
            border-radius: 10px;
            overflow-x: auto;
        }

        h1 {
            color: #FFD700;
            text-align: center;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #FFD700;
            padding: 10px;
            text-align: left;
            color: #FFFFFF;
        }

        th {
            background-color: #003366;
            color: #FFD700;
        }
    </style>
</head>
<body>
    <div class="table-container">
        <h1>Olympics Feedback Overview</h1>
        <?php
        if ($result->num_rows > 0) {
            echo "<table>";
            echo "<tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Rating</th>
                    <th>Comments</th>
                    <th>Submitted At</th>
                  </tr>";
            while ($row = $result->fetch_assoc()) {
                echo "<tr>
                        <td>" . $row['id'] . "</td>
                        <td>" . htmlspecialchars($row['username']) . "</td>
                        <td>" . htmlspecialchars($row['email']) . "</td>
                        <td>" . $row['rating'] . "</td>
                        <td>" . htmlspecialchars($row['comments']) . "</td>
                        <td>" . $row['submitted_at'] . "</td>
                      </tr>";
            }
            echo "</table>";
        } else {
            echo "<p>No feedback found.</p>";
        }
        $conn->close();
        ?>
    </div>
</body>
</html>
