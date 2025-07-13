// Add interactivity if needed (e.g., form validation)
document.querySelector('form').addEventListener('submit', function(event) {
    const num1 = document.getElementById('num1').value;
    const num2 = document.getElementById('num2').value;
    if (isNaN(num1) || isNaN(num2)) {
        alert('Please enter valid numbers');
        event.preventDefault();
    }
});
