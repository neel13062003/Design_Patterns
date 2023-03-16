/* global callback, useridField */

var xhr;
function init() {
    useridField = document.getElementById("userid");
    statusField = document.getElementById("status");
    function doChecking() {
        var url = "checkuserid?userid=" + escape(useridField.value);
        //var url = "checkuseridjsp.jsp?userid=" + useridField;
        xhr = createXHRObject();
        xhr.open("GET", url, true);
        xhr.onreadystatechange = callback;
        xhr.send(null);
    }

    function callback() {
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                setMessaage(xhr.responseXML);
            }
        }
    }

    function setMessaage(responseXML) {
        var statusElement = responseXML.getElementsByTagName("status")[0];
        var status = statusElement.childNodes[0].nodeValue;
        if (status == "NotAvailable") {
            statusField.innerHTML = "<font color=red>This User ld is already in use Please choose some other User ld.</font>";
        } else {
            statusField.innerHTML = "<font color=green>You can use this User ID.</font>";
        }
    }

    function createXHRObject() {
        var xhrObject;
        try {
            // Opera 8.0+, Firefox, Safari
            xhrObject = new XMLHttpRequest();
        } catch (e) {
            // Internet Explorer Browsers
            try {
                xhrObject = new ActiveXObject("Msxm12.XMLHTTP");
            } catch (e) {
                try {
                    xhrObject = new ActiveXObject("Microsoft.XMLHTTP");
                } catch (e) {
                    // Something went wrong
                    alert("Your browser broke!");
                    return false;
                }
            }
        }
        return xhrObject;
    }

    window.doChecking = doChecking;
}