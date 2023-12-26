const cards = document.getElementsByClassName("card");

for (const card of cards) {
    card.addEventListener('click', () => {

        const dataElm = card.querySelector("h2").textContent;

        fetch('/' + dataElm, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },

        }).then((response) => response.json())
            .then((data) => {
                console.log(data.toString());
            })
    });
}