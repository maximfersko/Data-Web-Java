const btn = document.getElementById("btn");

btn.addEventListener('click', () => {
    fetch('/data', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },

    }).then((response) => response.json())
        .then((data) => {
            console.log(data.toString());
        })
});