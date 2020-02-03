call runcrud.bat
if "%ERRORLEVEL%" == "0" goto launchTheBrowser
echo Cannot call runcrud.bat fail
goto fail

:launchTheBrowser
xdg-open http://localhost:8080/crud/v1/task/getTasks

:fail
echo There were errors

:end
echo Work is finished.