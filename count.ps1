$dir = "C:\6287192\github\java-all-in-one"
$count = 0

Get-ChildItem -Path $dir -Recurse -Filter "App.java" | ForEach-Object {
    $count++
}

Write-Host "Total number of App.java files: $count"
