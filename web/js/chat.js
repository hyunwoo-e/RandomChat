var chatModule = function() {
    var sock;

    function _init() {
        _bindSock();
        _bindEvent();
    };

    function _bindSock() {
        sock = new SockJS("/echo");
        sock.onmessage = onMessage;
        sock.onclose = onClose;
        sock.onopen = onOpen;
    }

    function _bindEvent() {
        $("#sendBtn").on("click", function() {
            _send();
        });

        $("#exitBtn").on("click", function () {
            _exit();
        });
    };

    function _send() {
        sock.send($("#message").val());
    }

    function _exit() {
        sock.close();
    }

    function onMessage(evt) {
        $("#chat").append(evt.data);
    }

    function onOpen(evt) {
        $("#chat").append("접속.");
    }

    function onClose(evt) {
        $("#chat").append("종료.");
    }

    return _init();
}();

