let activeElement = null;
let eyesCovered = false;
let blinking = null;

function onEmailBlur(e) {
    activeElement = null;
    setTimeout(function() {
        if (activeElement !== "email") {
            if(e.target.value === "") {
                e.target.parentElement.classList.remove("focusWithText");
            }
            startBlinking();
            resetFace();
        }
    }, 100);
}

function onEmailLabelClick(e) {
    activeElement = "email";
}

function onPasswordFocus(e) {
    activeElement = "password";
    if(!eyesCovered) {
        coverEyes();
    }
}

function coverEyes() {
    // Implementação da função coverEyes
}

function resetFace() {
    // Implementação da função resetFace
}

function startBlinking() {
    // Implementação da função startBlinking
}

function stopBlinking() {
    if (blinking) {
        blinking.kill();
        blinking = null;
    }
    // Implementação da função stopBlinking
}

function getRandomInt(max) {
    return Math.floor(Math.random() * Math.floor(max));
}

document.getElementById('togglePassword').addEventListener('click', function (e) {
    const passwordInput = document.getElementById('password');
    if (passwordInput.type === 'password') {
        passwordInput.type = 'text';
        openEyes();
    } else {
        passwordInput.type = 'password';
        closeEyes();
    }
});

function openEyes() {
    // Implemente a animação para abrir os olhos aqui
}

function closeEyes() {
    // Implemente a animação para fechar os olhos aqui
}