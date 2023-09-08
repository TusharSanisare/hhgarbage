// Smooth scrolling for navigation links
document.querySelectorAll('.nav-links a').forEach(link => {
    link.addEventListener('click', event => {
        event.preventDefault();
        const target = document.querySelector(link.getAttribute('href'));
        window.scrollTo({
            top: target.offsetTop - 100, // Adjust the offset as needed
            behavior: 'smooth'
        });
    });
});

// Subscription form submission
document.querySelector('.subscribe form').addEventListener('submit', event => {
    event.preventDefault();
    
    // Simulate form submission (replace with actual backend integration)
    const emailInput = document.querySelector('.subscribe input[type="email"]');
    const email = emailInput.value;
    
    // You can perform validation here before submitting
    
    alert(`Thank you for subscribing with email: ${email}`);
    
    // Clear the input field
    emailInput.value = '';
});
