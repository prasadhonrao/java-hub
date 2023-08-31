$dirPath = "C:\6287192\github\java-all-in-one"

Get-ChildItem -Path $dirPath -Recurse -Force |
    Where-Object { $_.Name -eq "bin" -or $_.Name -eq "out" -or $_.Extension -eq ".class" } |
    Remove-Item -Recurse -Force

